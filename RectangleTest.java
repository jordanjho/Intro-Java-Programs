public class RectangleTest {
    
    public static class Rectangle {
        private int width;
        private int height;
        public Rectangle() {
            width = 1;
            height = 1;
        }
        public Rectangle(int widthInit, int heightInit) {
            if (widthInit < 0) {
                widthInit = 1;
            }
            if (heightInit < 0) {
                heightInit = 1;
            }
            width = widthInit;
            height = heightInit;
        }
        public int getWidth() {
            return width;
        }
        public int getHeight() {
            return height;
        }
        public void setWidth(int widthUpdate) {
            if (widthUpdate < 0) {
                widthUpdate = 1;
            }
            width = widthUpdate;
        }
        public void setHeight(int heightUpdate) {
            if (heightUpdate < 0) {
                heightUpdate = 1;
            }
            height = heightUpdate;
        }
        public String toString() {
            return "Width: " + width + "\nHeight: " + height;
        }
        public boolean isSquare() {
            if (width == height) {
                return true;
            }
            else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(-4, 5);
        
        System.out.println(r1);
        System.out.println(r1.isSquare());


        r1.setWidth(5);
        
        System.out.println(r1);
        System.out.println(r1.isSquare());
    }
    /*
    All Rectangle objects have a width and height.
    If the width and height are equal, the Rectangle is a square.
    */
}



