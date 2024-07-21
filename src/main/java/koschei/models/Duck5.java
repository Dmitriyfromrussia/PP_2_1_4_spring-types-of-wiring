package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {

    @Autowired
    private Egg6 egg; //понимаю, что лучше связывать объекты через конструктор, тк в данном случае не возможно закрыть сделать поле final

    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }
}
