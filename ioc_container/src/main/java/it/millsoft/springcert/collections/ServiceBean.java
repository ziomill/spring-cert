package it.millsoft.springcert.collections;

import it.millsoft.springcert.commons.InjectedBean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ServiceBean
{
    private List<InjectedBean> list;
    private Set<String> set;
    private Map<String,InjectedBean> map;

    public ServiceBean(List<InjectedBean> list,Set<String> set,Map<String,InjectedBean> map)
    {
        this.list = list;
        this.set = set;
        this.map = map;
    }

    @Override
    public String toString() {
        return "ServiceBean{" +
                "list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
