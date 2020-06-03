package com.wj.constant;

public class SqlConstant {

	//是否
	public enum JudgeStatus {

		// 否
		NO(0),
		// 是
		YES(1);

		private int value;

		private JudgeStatus(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	// 男女
	public enum SexStatus {

		// 否
		MALE(0),
		// 是
		FEMALE(1);

		private int value;

		private SexStatus(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}
}
