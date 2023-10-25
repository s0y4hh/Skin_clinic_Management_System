public class NameBanner{
    String name;
    public NameBanner(String name){
        this.name = name;
    }
    public void show(){
        int bannerWidth = 50;
        int namePadding = (bannerWidth - name.length()) / 2;

        // Print the top border of the banner
        for (int i = 0; i < bannerWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print the name with padding
        for (int i = 0; i < namePadding; i++) {
            System.out.print(" ");
        }
        System.out.println(name);

        // Print the bottom border of the banner
        for (int i = 0; i < bannerWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        
    }
}
