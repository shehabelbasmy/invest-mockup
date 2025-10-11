package com.eblacorp.invest.mockup.moi.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ELIGIBLE_PERSONS")
public class EligiblePersons {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ELIGIBLE_PERSONS_SEQ")
	@SequenceGenerator(allocationSize = 1,name = "ELIGIBLE_PERSONS_SEQ",sequenceName = "ELIGIBLE_PERSONS_SEQ")
	private Long id;
	
	private String qid;
	
	private String appType;
	
	private Date expiryDate;
	private String respArabicMsg;
    private String respCode;
    private String respEngMsg;
    private String applicantType;
    private String allowedToApply;
    private String applicantTypeDesAr;
    private String applicantTypeDesEn;
    private String notesAr;
    private String notesEn;
    @OneToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name="APPLICATION_ID")
	private RealEstateApplication application;
	
}
