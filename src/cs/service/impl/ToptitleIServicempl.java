package cs.service.impl;

import cs.dao.impl.ToptitleDaoImpl;
import cs.entity.Toptitle;
import cs.service.ToptitleService;

import java.util.List;

public class ToptitleIServicempl implements ToptitleService {
    private ToptitleDaoImpl tdi=new ToptitleDaoImpl();
    @Override
    public List<Toptitle> TopfindToptitleInfoAll() throws Exception {
        return tdi.TopfindToptitleInfoAll();
    }
}
