package DBLayer;

import ModelLayer.Calendar;

/**
 * Created by atee on 2017.06.02..
 */
public interface IFDBCalendar {
    public int insertCalendar(Calendar calendar) throws Exception;
}
