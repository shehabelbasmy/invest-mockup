package com.eblacorp.mockup.moi.entity;

import static javax.persistence.EnumType.STRING;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import com.eblacorp.mockup.moi.enums.ApplicantTypeEnum;
import com.eblacorp.mockup.moi.enums.MoiDecisionCode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="MOI_APPLICATION")
public class MoiApplication {

	@Id
	@Column(name = "ID")
	@SequenceGenerator(name = "moiApplicaionSequence", sequenceName = "MOI_APPLICATION_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "moiApplicaionSequence")
	private Long id;

	@Column(name="INVEST_REQUEST_ID")
	private Long investRequest;

	@NaturalId
	@Column(name="MOI_APPLICATION_NUMBER")
	private Long applicationNumber;

	@Column(name="CUSTOMER_ID")
	private Long customerId;
	
	@Column(name="APPLICANT_TYPE")
	@Enumerated(STRING)
	private ApplicantTypeEnum applicantType;

	@Column(name="IS_CANCELED")
	private Boolean isCanceled;

	@Enumerated(STRING)
	@Column(name="APPLICATION_DECISION_CODE")
	private MoiDecisionCode applicationDecisionCode;

	@Column(name = "APPLICATION_STATUS_AR")
	private String applicationStatusAr;

	@Column(name = "APPLICATION_STATUS_EN")
	private String applicationStatusEn;

	@Column(name = "VISA_NUMBER")
	private String visaNumber;

	@Column(name = "VISA_ISSUE_DATE")
	private Date visaIssueDate;

	@Column(name = "VISA_EXPIRY_DATE")
	private Date visaExpiryDate;

	@Column(name = "APPLICATION_DATE")
	private Date applicationDate;

	@Column(name = "APPLICATION_EXPIRY_DATE")
	private Date applicationExpiryDate;

	@Column(name = "NOTES_AR")
	private String notesAr;

	@Column(name = "NOTES_EN")
	private String notesEn;

	@Column(name = "QID")
	private Long qid;

	@Column(name = "QID_STATUS")
	private String qidStatus;
	
	//the following fields is newly add
	@Column(name="SECURITY_CHECK_EXPIRY_DATE")
    private Date securityCheckExpiryDate;
    
	@Column(name="FINAL_DECISION_ARABIC_NOTES")
    private String finalDecisionArabicNotes;
	
	@Column(name="FINAL_DECISION_ENGLISH_NOTES")
    private String finalDecisionEnglishNotes;
	
	@Column(name="CEID_DECISION")
    private String ceidDecision;
	
	@Column(name="CEID_ARABIC_NOTES")
    private String ceidArabicNotes;
	
	@Column(name="CEID_ENGLISH_NOTES")
    private String ceidEnglishNotes;
	
	@Column(name="SSB_DECISION")
    private String ssbDecision;
	
	@Column(name="SSB_ARABIC_NOTES")
    private String ssbArabicNotes;
	
	@Column(name="SSB_ENGLISH_NOTES")
    private String ssbEnglishNotes;
	
	@Column(name="TOR_DECISION")
    private String torDecision;
	
	@Column(name="TOR_ARABIC_NOTES")
    private String torArabicNotes;
	
	@Column(name="TOR_ENGLISH_NOTES")
    private String torEnglishNotes;

	@Column(name="FAIL")
	private Boolean fail;
	
}
