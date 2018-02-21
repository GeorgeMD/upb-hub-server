package srv.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import srv.entities.GroupEntity;
import srv.entities.ScheduleEntity;

import java.sql.Date;

/**
 * @author GeorgeMD
 */
@Repository
public interface ScheduleRepo extends CrudRepository<ScheduleEntity, Integer> {
//    @Query("SELECT se FROM ScheduleEntity se WHERE se.date = :d AND se.groupByGroupId = :ge ORDER BY se.startHour")
//    Iterable<ScheduleEntity> findEntriesByGroupAndDate(@Param("ge") GroupEntity ge, @Param("d") Date date);

    Iterable<ScheduleEntity> findAllByGroupByGroupIdAndDayOrderByStartHourAsc(GroupEntity group, String day);

    @Query("SELECT se FROM ScheduleEntity se " +
            "WHERE se.day = :day " +
            "AND se.groupByGroupId = :ge " +
            "AND (se.weekParity = :wp OR se.weekParity = 0) " +
            "AND (se.semigroup = :sg OR se.semigroup = 0) " +
            "ORDER BY se.startHour")
    Iterable<ScheduleEntity> findAllByFilter(@Param("ge") GroupEntity ge,
                                             @Param("day") String day,
                                             @Param("wp") int wp,
                                             @Param("sg") int sg);
}
