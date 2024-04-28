package April27.Interface2;

public class IndianChineseFood implements IndianFood, ChineseFood{

    @Override
    public void type() {
        System.out.println("Vegetarian");
    }

    @Override
    public void spiceLevel() {
        System.out.println("Mild");
    }
}
