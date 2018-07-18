public class Khahani {
    public static void main(String[] args) {
        // TODO: 1- create three rectangle
        int width1, height1;
        width1 = 2;
        height1 = 4;

        int width2, height2;
        width2 = 5;
        height2 = 3;

        int width3, height3;
        width3 = 10;
        height3 = 4;

        // TODO: 2- Print area of each rectangle
        int area1 = width1 * height1;
        System.out.println("Rectangle 1 area: " + area1);

        System.out.println("Rectangle 2 area: " + width2 * height2);

        System.out.println("Rectangle 3 area: " + width3 * height3);

        // TODO: 3- Print environment of each rectangle
        System.out.println("Rectangle 1 environment: " + (width1 + height1) * 2);
        System.out.println("Rectangle 2 environment: " + (width2 + height2) * 2);
        System.out.println("Rectangle 3 environment: " + (width3 + height3) * 2);

        // TODO: 4- Create two circle
        float radius1, radius2;

        radius1 = 12.5f;
        radius2 = 5.25f;

        // TODO: 5- Print area of each circle
        float pi = 3.14f;
        float circleArea1 = radius1 * radius1 * pi;
        float circleArea2 = radius2 * radius2 * pi;

        System.out.println("Circle area 1: " + circleArea1);
        System.out.println("Circle area 2: " + circleArea2);

        // TODO: 6- Print environment of each circle
    }
}
