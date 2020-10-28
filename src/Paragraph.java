public class Paragraph implements Element {
    private String text;

    @Override
    public void print()
    {
        System.out.println("Paragraph: " + this.text);
    }

    public Paragraph(String text) {
        this.text = text;
    }
}