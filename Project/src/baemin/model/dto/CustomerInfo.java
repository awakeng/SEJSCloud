package baemin.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CustomerInfo {

	private String nickName;
	private String name;
	private String region;
	private int amount;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[�� ���� : ");
		builder.append(nickName);
		builder.append(", �� �̸� : ");
		builder.append(name);
		builder.append(", �� �ּ� : ");
		builder.append(region);
		builder.append(", �ֹ� Ƚ�� : ");
		builder.append(amount);
		builder.append("]");
		return builder.toString();
	}

}
