public class TriangleEdgesCheck {
    // ham kiem tra tam giac hop le
    public void checkTriangleEdges(int a, int b, int c) throws TriangleEdgesException{
        if (a+b<=c||c+a<=b||b+c<=a){
            throw new TriangleEdgesException("loi: tam giac khong hop le");
        }else {
            System.out.println("tam giac hop le");
        }
    }
}
