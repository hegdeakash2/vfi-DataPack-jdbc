package comdatapack.util;

public class DBQueries {
	public static final String INSERTQUERY=
			"INSERT INTO DATAPACK(brand,type,duration,price,id)values(?,?,?,?,?)";
	public static final String UPDATEQUERY="UPDATE DATAPACK SET price=? where id=?";
	public static final String DELETEQUERY="DELETE FROM DATAPACK WHERE id=?";

	public static final String SELECTQUERY="SELECT * FROM DATAPACK";
	public static final String SELECTBYBRAND="SELECT * FROM DATAPACK WHERE BRAND=?";
	public static final String SELECTBYTYPE="SELECT * FROM DATAPACK WHERE TYPE=?";
	public static final String SELECTBYDURATION="SELECT * FROM DATAPACK WHERE DURATION=?";
	public static final String SELECTBYPRICE="SELECT * FROM DATAPACK WHERE PRICE=?";
	public static final String SELECTBYID="SELECT * FROM DATAPACK WHERE ID=?";
}
