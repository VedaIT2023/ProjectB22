package com.vedait.hospitals;

public class Wards {
	
	class GeneralWard extends CommonWard{
		boolean hasPrivateRooms;
		GeneralWard(String wardType,int capacity,boolean hasPrivateRooms){
			super(wardType,capacity);			
			this.hasPrivateRooms=hasPrivateRooms;
		}
		
	}

	class ICUWard extends CommonWard {
		boolean specializedEquipment;
		ICUWard(String wardType, int capacity, boolean specializedEquipment) {
            super(wardType, capacity);
            this.specializedEquipment = specializedEquipment;
        }
		
	}

	class PediatricWard extends CommonWard {
		int ageRange;
		PediatricWard(String wardType, int capacity, int ageRange) {
            super(wardType, capacity);
            this.ageRange = ageRange;
        }
		
	}

	class MaternityWard extends CommonWard {
		boolean laborDeliveryRooms;
		boolean neonatalICU;
		MaternityWard(String wardType, int capacity, boolean laborDeliveryRooms, boolean neonatalICU) {
            super(wardType, capacity);
            this.laborDeliveryRooms = laborDeliveryRooms;
            this.neonatalICU = neonatalICU;
        }
		
	}

	class PsychiatricWard extends CommonWard {
		String specialty;
		PsychiatricWard(String wardType, int capacity, String specialty) {
            super(wardType, capacity);
            this.specialty = specialty;
        }
	}

	class CardiacWard extends CommonWard {
		boolean specializedStaff;
		CardiacWard(String wardType, int capacity, boolean specializedStaff) {
            super(wardType, capacity);
            this.specializedStaff = specializedStaff;
        }
		
	}

	class BurnUnit extends CommonWard {
		boolean advancedWoundCare;
		BurnUnit(String wardType, int capacity, boolean advancedWoundCare) {
            super(wardType, capacity);
            this.advancedWoundCare = advancedWoundCare;
        }
		
	}

	class EmergencyWard extends CommonWard {
		String wardType;
		EmergencyWard(String wardType, int capacity) {
            super(wardType, capacity);
        }
		
	}

	class SurgeryWard extends CommonWard {
		String surgicalSpecialty;
		SurgeryWard(String wardType, int capacity, String surgicalSpecialty) {
            super(wardType, capacity);
            this.surgicalSpecialty = surgicalSpecialty;
        }
		
	}

	class IsolationWard extends CommonWard {
		String isolationType;
		IsolationWard(String wardType, int capacity, String isolationType) {
            super(wardType, capacity);
            this.isolationType = isolationType;
        }
		
	}
}
