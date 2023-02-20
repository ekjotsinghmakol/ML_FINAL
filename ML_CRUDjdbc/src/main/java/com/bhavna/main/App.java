package com.bhavna.main;

import com.bhavna.bean.Sneakers;
import com.bhavna.service.Operations;

public class App {
	public static void main(String[] args) {

		Operations operation = new Operations();
		Sneakers shoe3 = new Sneakers(29000.0, 101);
//			operation.insertData(shoe3);

		operation.updateData(shoe3);
		operation.getData();

	}
}
