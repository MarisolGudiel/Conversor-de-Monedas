public class Divisa {


    private String base_code;
    private String target_code;
    private double conversion_result;


    public Divisa(Moneda moneda) {
        this.base_code = moneda.base_code();
        this.target_code = moneda.target_code();
        this.conversion_result = moneda.conversion_result();
    }

    @Override
    public String toString() {
        return  "" + conversion_result;


    }
}
