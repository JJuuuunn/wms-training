package inventory.domain;

import inventory.enums.WhType;
import lombok.Data;

@Data
public class Warehouse {
    // 창고 id
    private Long id;
    // 창고 타입

    //private String type; // TODO : enum으로 변경
    //택배사
    private Long delivery_id;

    private WhType type;

    // 지역
    private String location;

}
