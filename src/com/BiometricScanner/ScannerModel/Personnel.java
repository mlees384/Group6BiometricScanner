/**
 * 
 */
package com.BiometricScanner.ScannerModel;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author mlees
 *
 * The Personnel class represents the User of the system.
 */

public abstract class Personnel implements SelfCheckCapable {
	
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private int personnelID;
	
	public String addRecord() {
		System.out.println("Record added");
		return "John Doe";
	}
	
	public boolean removeRecord() {
		System.out.println("Record removed");
		return false;
	}
	
	public String updateRecord() {
		System.out.println("Record updated");
		return "Jane Doe";
	}
	
	public boolean passThrough() {
		System.out.println("User passed Through");
		return true;
		
	}
	
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Personnel";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
