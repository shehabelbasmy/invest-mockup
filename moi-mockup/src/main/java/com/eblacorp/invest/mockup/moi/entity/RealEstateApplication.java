package com.eblacorp.invest.mockup.moi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.eblacorp.invest.mockup.moi.enums.ApplicantTypeEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "REAL_ESTATE_APPLICATION")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RealEstateApplication {

	@Id
	@Column(name = "ID")
	@SequenceGenerator(name = "REAL_ESTATE_APPLICATION_SEQ", sequenceName = "REAL_ESTATE_APPLICATION_SEQ", initialValue = 1)
	@GeneratedValue(generator = "REAL_ESTATE_APPLICATION_SEQ", strategy = GenerationType.SEQUENCE)
	private Long id;
	private String processStatusCode;
	private String processStatusDescArb;
	private String processStatusDescEng;
	private String applicationNumber;
	private ApplicantTypeEnum applicantType;
	private String applicationStatusDesEn;
	private String applicationStatusDesAr;
	private String visaNumber;
	private String visaStatusDesEn;
	private String visaStatusDesAr;
	private Date visaIssueDate;
	private Date visaExpiryDate;
	private Date aplRecieveDate;
	private Date aplExpiryDate;
	private String residentQID;
	private String notesAr;
	private String notesEn;

}
