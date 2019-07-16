package baemin.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class BaeminCustomerInfo {

	private String id;
	private NewInfo newinfo;
	private LastInfo lastinfo;
	private CustomerInfo customerinfo;
	private String grade;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. �� ���̵� : ");
		builder.append(id);
		builder.append("\n2. �� ���� : ");
		builder.append(customerinfo);
		builder.append("\n3. ���ο� �ֹ� ����: ");
		builder.append(newinfo);
		builder.append("\n4. ���� �ֱ� �ֹ� ����: ");
		builder.append(lastinfo);
		builder.append("\n5. �� ���: ");
		builder.append(grade);
		builder.append("\n");
		return builder.toString();
	}

}
