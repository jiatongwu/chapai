package cn.xvkang.utils.mybatis;

public class TableNameGenerateMybatisGeneratorXML {
	public static void main(String[] args) {

		String[] arr = { 
				
				"xm",
				"student",
				"xm_student",
				"check_room",
				"doctor",
				"base_check",
				"neike_check",
				"waike_check",
				"eye_check",
				"kouqiang_check",
				"shiyanshi_check",
				"zongjiebaogao_check",
				"health_zhidao",
				"permission",
				"role",
				"user",
				"user_role",
				"role_permission"
		};

		for (String ar : arr) {
			String token = ar.trim();
			String xml = "<table tableName=\"%s\">\r\n" + 
					"			<property name=\"useActualColumnNames\" value=\"false\" />\r\n" + 
					"			<generatedKey column=\"id\" sqlStatement=\"Mysql\" identity=\"true\" />\r\n" + 
					"		</table>";
			System.out.printf(xml, token);
			System.out.println();
		}
	}

}
