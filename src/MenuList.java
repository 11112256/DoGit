import java.lang.reflect.Array;
import java.util.ArrayList;

public class MenuList implements propertyLeaf,MenuProp {

     ArrayList<MenuList>  list = new ArrayList<>();
     String name;
     String prop;
     boolean flag =false ;
     public MenuList(String name,String prop)
     {
         this.name=name;
         this.prop = prop;
     }

    @Override
    public void addMenu(MenuList menuList) {
        list.add(menuList);
    }

    @Override
    public void addleaf(Leaf leaf) {
  
    }

    @Override
    public void remove(int n) {

    }

    @Override
    public MenuList getChild(MenuList menuList) {
        return null;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getProp() {
        return null;
    }
}
