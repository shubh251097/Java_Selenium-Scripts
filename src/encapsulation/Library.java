package encapsulation;

public class Library {

	public static void main(String[] args) {
		Books bk=new Books();
		bk.setid(11);
		bk.setName("Shubham");
		bk.setBranch("Computer");
		bk.setMobNo(823456000);
		bk.setRollNo(24);
		bk.seteMail("shubham@gmail.com");
		bk.setDept("IT");
		
		System.out.println("Id=" + bk.getid());
		System.out.println("Name=" + bk.getName());
		System.out.println("Branch=" + bk.getBranch());
		System.out.println("MobNo=" + bk.getMobNo());
		System.out.println("RollNo=" + bk.getRollNo());
		System.out.println("Email=" + bk.geteMail());
		System.out.println("Dept=" + bk.getDept());
		

		}
		
		static class Books {
			private int id;
			private String name;
			private String branch;
			private long mobNo;
			private int rollNo;
			private  String eMail;
			private String dept;
			
			
			
			public int getid() {
				return id;
			}
			public void setid(int id) {
				this.id=id;   //Here this refers to current class instance
			}
			
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			
			public String getBranch() {
				return branch;
			}
			public void setBranch(String branch) {
				this.branch = branch;
			}
			
			public long getMobNo() {
				return mobNo;
			}
			public void setMobNo(long mobNo) {
				this.mobNo = mobNo;
			}
			
			public int getRollNo() {
				return rollNo;
			}
			public void setRollNo(int rollNo) {
				this.rollNo = rollNo;
			}
			
			
			public String geteMail() {
				return eMail;
			}
			public void seteMail(String eMail) {
				this.eMail = eMail;
			}
			
			public String getDept() {
				return dept;
			}
			public void setDept(String dept) {
				this.dept = dept;
			}
			

		}
	

	}


