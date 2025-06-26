package com.eblacorp.mockup.moi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class VisitorApplicantDetailDto {

	private String visaNumber;                    
    private String passportNumber;                
    private String passportType;                  
    private String passportTypeDescEn;            
    private String passportTypeDescAr;            
    private String passportSubType;               
    private String passportExpiryDate;            
    private String passportIssueCountryCode;      
    private String passportIssueCountryDesEn;     
    private String passportIssueCountryDesAr;     
    private String passportIssueDate;             
    private String countryOfBirth;                
    private String genderCode;                    
    private String genderDescAr;                  
    private String genderDescEn;                  
    private String natCode;                       
    private String natDescAr;                     
    private String natDescEn;                     
    private String profCode;                      
    private String profDescAr;                    
    private String profDescEn;                    
    private String dateOfBirth;                   
    private String birthCity;                     

    private NameDto name;                            
    private String phoneNumberQatar;              
    private String address;                       

    private String visaType;                      
    private String visaTypeDesEn;                 
    private String visaTypeDesAr;                 
    private String visaPurpose;                   
    private String visaPurposeDesEn;              
    private String visaPurposeDesAr;              
    private String visaExpiryDate;                
    private String visaStayExpiryDate;            
    private String visaStatusCode;                
    private String visaStatusDesEn;               
    private String visaStatusDesAr;               

    private VisitorEditingDto visitorEditing;        
    private String visitorApplicationNumber;      
    private String visitorApplicationStatusArabic;   
    private String visitorApplicationStatusEnglish;  
    private String allowedToCancel;  
}
