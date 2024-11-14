package com.oops;

class SBI {

	public double R = 9.5;
	public static double I = 250;
	public static float T = 1;

	// p=IRT
	public void homeLoan(double amt) {

		double principle = I * R * T;

		System.out.println(principle);
	}

	class ICIC extends SBI {

		public double R = 11.5;

		public void homeLoan(double amt) {

			double principle = I * R * T;

			System.out.println(principle);
		}

		class HDFC extends ICIC {
			public double R = 10;

			public void homeLoan(double amt) {

				double principle = I * R * T;

				System.out.println(principle);
			}
		}

	}
}
