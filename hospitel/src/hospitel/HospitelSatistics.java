package hospitel;

public class HospitelSatistics {

	public static void count(Hospitel hospitel) {
		int countDoctors = 0, countNurses = 0, countPatients = 0;
		for (int i = 0; i < hospitel.getRooms().length; i++) {
			++countDoctors;
			++countNurses;
			for (int j = 0; j < hospitel.getRooms()[i].getPatients().length; j++) {
				++countPatients;
			}
		}
		System.out.println("The number of doctors: " + countDoctors + "\nThe number of nurses: " + countNurses
				+ "\nThe number of Patients: " + countPatients + "\nTotal: "
				+ (countDoctors + countNurses + countPatients));
	}

	public static void avgDisease(Hospitel hospitel) {
		double avgDisease = 0;
		int count = 0;
		for (int i = 0; i < hospitel.getRooms().length; i++) {
			for (int j = 0; j < hospitel.getRooms()[i].getPatients().length; j++) {
				avgDisease += hospitel.getRooms()[i].getPatients()[j].getDisease().getTimeToCure();
				++count;
			}
		}
		System.out.println("Average recovery time: " + (avgDisease / count));
	}

	public static void avgAllDisease(Hospitel hospitel) {
		double[] diseasesTimes = new double[DiseaseDescription.values().length];
		double[] diseasesPatientCounter = new double[DiseaseDescription.values().length];

		for (int i = 0; i < hospitel.getRooms().length; i++) {
			for (int j = 0; j < hospitel.getRooms()[i].getPatients().length; j++) {

				switch (hospitel.getRooms()[i].getPatients()[j].getDisease().getDiseaseDescription()) {
				case TUBERCULOSIS: {
					diseasesTimes[0] = diseasesTimes[0]
							+ hospitel.getRooms()[i].getPatients()[j].getDisease().getTimeToCure();
					diseasesPatientCounter[0] = diseasesPatientCounter[0] + 1;

					break;
				}
				case PNEUMONIA: {
					diseasesTimes[1] = diseasesTimes[1]
							+ hospitel.getRooms()[i].getPatients()[j].getDisease().getTimeToCure();
					diseasesPatientCounter[1] = diseasesPatientCounter[1] + 1;
					break;
				}
				case COVID19: {
					diseasesTimes[2] = diseasesTimes[2]
							+ hospitel.getRooms()[i].getPatients()[j].getDisease().getTimeToCure();
					diseasesPatientCounter[2] = diseasesPatientCounter[2] + 1;

					break;
				}

				case FRACTURE: {
					diseasesTimes[3] = diseasesTimes[3]
							+ hospitel.getRooms()[i].getPatients()[j].getDisease().getTimeToCure();
					diseasesPatientCounter[3] = diseasesPatientCounter[3] + 1;

					break;
				}

				case CARDIO: {
					diseasesTimes[4] = diseasesTimes[4]
							+ hospitel.getRooms()[i].getPatients()[j].getDisease().getTimeToCure();
					diseasesPatientCounter[4] = diseasesPatientCounter[4] + 1;
					break;
				}
				default:
					System.out.println(" no diseases ");

				}
			}

		}

		for (int i = 0; i < DiseaseDescription.values().length; i++) {
			if (diseasesPatientCounter[i] == 0) {
				System.out.println(DiseaseDescription.values()[i] + " :   0");
			} else {
				System.out
						.println(DiseaseDescription.values()[i] + " : " + diseasesTimes[i] / diseasesPatientCounter[i]);
			}

		}

	}

	public static int[] countDisease(Hospitel hospitel) {
		int[] countDisease = new int[DiseaseDescription.values().length];
		for (int i = 0; i < hospitel.getRooms().length; i++) {
			for (int j = 0; j < hospitel.getRooms()[i].getPatients().length; j++) {
				switch (hospitel.getRooms()[i].getPatients()[j].getDisease().getDiseaseDescription()) {
				case CARDIO:
					countDisease[0] = countDisease[0] + 1;
					break;
				case COVID19:
					countDisease[1] = countDisease[1] + 1;
					break;
				case FRACTURE:
					countDisease[2] = countDisease[2] + 1;
					break;
				case PNEUMONIA:
					countDisease[3] = countDisease[3] + 1;
					break;
				case TUBERCULOSIS:
					countDisease[4] = countDisease[4] + 1;
					break;

				default:
					break;
				}
			}
		}
		return countDisease;
	}

//	public static void avgAgeForEachDisease(Hospitel hospitel) {
//	 for (int i = 0; i < DiseaseDescription.values().length; i++) {
//		 DiseaseDescription.values()[i];
//		
//	}
}
