package cn.zzl.service.impl;

import cn.zzl.dto.Film;
import cn.zzl.mapper.FilmMapper;
import cn.zzl.service.IInsertFilmMsgService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by ZZL on 2016/12/29.
 */
@Service
@Component("InsertFilmMsgServiceImpl")
public class InsertFilmMsgServiceImpl implements IInsertFilmMsgService {
    @Resource
    private FilmMapper filmMapper;
    @Override
    public int insertMsgIntoFilm(Film film) {
        return this.filmMapper.insertMsgFilm(film);
    }
}
