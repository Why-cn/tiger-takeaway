package edu.Northeastern.CS5200.finalProject.dto;

import edu.Northeastern.CS5200.finalProject.entity.Setmeal;
import edu.Northeastern.CS5200.finalProject.entity.SetmealDish;
import lombok.Data;

import java.util.List;


/**
 * <p>Project: tiger-takeaway - SetmealDto 套餐数据传输对象
 * <p>Powered by river On 2023/01/14 5:23 PM
 * <p>
 * <hr/>
 * <b>dto: data transfer object，主要用于多表查询时，将查询结果封装成一个对象，方便前端使用。<b/>
 * <hr/>
 *
 * @author Riverify
 * @version 1.0
 * @since JDK8
 */
@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;

}
