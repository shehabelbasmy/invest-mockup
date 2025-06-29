package com.eblacorp.invest.mockup.moi.rest.request;

import java.util.Date;
import java.util.List;

import com.eblacorp.invest.mockup.moi.dto.BeneficiaryFlatDto;
import com.eblacorp.invest.mockup.moi.dto.BeneficiaryParcelDto;
import com.eblacorp.invest.mockup.moi.dto.OwnershipFlatDto;
import com.eblacorp.invest.mockup.moi.dto.OwnershipParcelDto;
import com.eblacorp.invest.mockup.moi.dto.RequiredDocumentDto;
import com.eblacorp.invest.mockup.moi.dto.VisitorApplicantDetailDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class ReceiveRealestateApplicationRequest {

    private String cpyType;//
	private String cpyNo;//
	private String cpyBr;//
	private String residentQID;//customer.civilId
	private Date residentQidExpDte;//customer.idExpiryDate
	private List<OwnershipParcelDto> ownershipParcels;//done
	private List<OwnershipFlatDto> ownershipsFlats;//done
	private List<BeneficiaryParcelDto> beneficiaryParcels;//done
	private List<BeneficiaryFlatDto> beneficiaryFlats;//done
	private String mojAplRefNum;//moiApplicationId
	private String applicationType; //customer.applicantType

	private List<RequiredDocumentDto> requiredDocument;

	private VisitorApplicantDetailDto visitorApplicantDetail;//?
	
	
	private String newProfessionCode;//?
	private String notesArb;//?
	private String notesEng;//?
	private String locationId;//?
    
}
