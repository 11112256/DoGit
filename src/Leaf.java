


public class Leaf implements  propertyLeaf {

    String name;
    String prop;
    public Leaf(String name,String prop){

        this.name =name ;
        this.prop = prop;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getProp() {
        return prop;
    }

    @Override
    public MenuList getparent() {
        return null;
    }




}
