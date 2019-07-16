package baemin.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class OrderInfo {

	private String number;
	private String place;
	private String order;
	private String location;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[��ȣ : ");
		builder.append(number);
		builder.append(", �ֹ����� : ");
		builder.append(order);
		builder.append(", �ֹ����� : ");
		builder.append(location);
		builder.append(", ��޾�ü : ");
		builder.append(place);
		return builder.toString();
	}

}
