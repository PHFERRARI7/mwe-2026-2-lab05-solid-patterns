namespace Faturamento.Api.Dominio;

public interface IFaturaRepository
{
    Fatura Salvar(Fatura fatura);

    Fatura? PorPedido(string pedidoId);

    IReadOnlyList<Fatura> Todas();
}
