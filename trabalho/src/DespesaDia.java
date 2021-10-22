public class DespesaDia {

    private Double dia;
    private Double mes;
    private Double valor;

    public DespesaDia(Double dia, Double mes, Double valor) {
        this.dia = dia;
        this.mes = mes;
        this.valor = valor;
    }

    public Double getDia() {
        return dia;
    }

    public void setDia(Double dia) {
        this.dia = dia;
    }

    public Double getMes() {
        return mes;
    }

    public void setMes(Double mes) {
        this.mes = mes;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Boolean equals(DespesaDia despesaDia) {
        if (this.dia == despesaDia.getDia() && this.mes == despesaDia.getMes() && this.valor == despesaDia.getValor()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "DespesaDia [dia=" + dia + ", mes=" + mes + ", valor=" + valor + "]";
    }

}
