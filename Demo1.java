
Demo1
{
	public static void main(String[] args) throws Exception
	{
		String driver="oracle.jdbc.driver.OracleDriver";
	     String jdbc_url="jdbc:oracle:thin:@Localhost:1521:XE";
		 String user="manish";
		 String pwd="manish";
		 String query="select*from emp1";
		 
		 Class.forName(driver);
		 Connection con=DriverManager.getConnection(jdbc_url,user,pwd);
		 Statement st=con.creatStetement();
		 Resultset rs=st.executeQuery(query);
		 while(rs.next())
		{
			 System.out.println(rs.getInt(1)+"...."+rs.getString(2)+"..."+rs.getInt(3)+"...."+rs.getString(4));

	}
con.clse();
	}
}

