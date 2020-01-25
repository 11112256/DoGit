

  interface MenuProp {

    public void addMenu(MenuList menuList);
    public void addleaf(Leaf leaf);
    public void remove(int n) ;
    public MenuList getChild(MenuList menuList);
    public boolean isLeaf();
   }
