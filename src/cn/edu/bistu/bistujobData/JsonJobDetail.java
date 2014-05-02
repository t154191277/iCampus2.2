package cn.edu.bistu.bistujobData;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonJobDetail {
	public JobDetailType getList(String information) {
		JobDetailType detailType = new JobDetailType();
		try {
			System.out.println(information);
			JSONObject jsonObject = new JSONObject(information);
			detailType.setId(jsonObject.getString("id"));
			detailType.setTitle(jsonObject.getString("title"));
			detailType.setTypeid(jsonObject.getString("typeid"));
			detailType.setDescription(jsonObject.getString("location"));
			detailType.setLocation(jsonObject.getString("qualifications"));
			detailType.setSalary(jsonObject.getString("salary"));
			detailType.setCompany(jsonObject.getString("company"));
			detailType.setContactName(jsonObject.getString("contactName"));
			detailType.setContactEmail(jsonObject.getString("contactEmail"));
			detailType.setContactPhone(jsonObject.getString("contactPhone"));
			detailType.setContactQQ(jsonObject.getString("contactQQ"));
			detailType.setUserid("userid");
			detailType.setTime("time");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return detailType;
	}
}
