# Jython script for safe deployment on WebSphere standalone server
# Usage:
# wsadmin.sh -lang jython -user USER -password PASS -f deploy_app.py MyApp MyApp.war server1

import sys

appName     = sys.argv[0]   # e.g. MyApp
warFile     = sys.argv[1]   # e.g. MyApp.war
serverName  = sys.argv[2]   # e.g. server1

print "=== Checking if application exists: " + appName + " ==="
installedApps = AdminApp.list().splitlines()

if appName in installedApps:
    print "Application exists. Uninstalling: " + appName
    AdminApp.uninstall(appName)
    AdminConfig.save()
else:
    print "Application not found. Proceeding with fresh install."

print "=== Installing application: " + appName + " from " + warFile + " ==="
AdminApp.install(
    warFile,
    ['-appname', appName, '-server', serverName]
)

print "=== Saving configuration ==="
AdminConfig.save()

print "=== Deployment complete ==="
