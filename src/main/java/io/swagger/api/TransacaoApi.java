/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.17).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Transacao;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-12-18T00:23:04.566Z")

@Api(value = "transacao", description = "the transacao API")
@RequestMapping(value = "/bytebank-api/v1")
public interface TransacaoApi {

    @ApiOperation(value = "Altera o valor da  Transação", nickname = "alteraValorTransacao", notes = "Altera o valor da  Transação existente", authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Transacao", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Alteracao realizada com sucesso"),
        @ApiResponse(code = 400, message = "Requisição inválida."),
        @ApiResponse(code = 401, message = "Requisição não autorizada."),
        @ApiResponse(code = 500, message = "Erro no servidor.") })
    @RequestMapping(value = "/transacao/{codigo}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> alteraValorTransacao(@ApiParam(value = "",required=true) @PathVariable("codigo") Long codigo,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "valor", required = true) Double valor,@ApiParam(value = "" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization);


    @ApiOperation(value = "Cadastra Transacao na Conta", nickname = "cadastraTransacao", notes = "Cadastra uma transacao de debito ou deposito na conta.", response = Transacao.class, authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Transacao", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Transação cadastrada com sucesso!", response = Transacao.class),
        @ApiResponse(code = 400, message = "Requisição inválida."),
        @ApiResponse(code = 401, message = "Requisição não autorizada."),
        @ApiResponse(code = 500, message = "Erro no servidor.") })
    @RequestMapping(value = "/transacao",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Transacao> cadastraTransacao(@ApiParam(value = "" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Transacao transacao,@NotNull @ApiParam(value = "", required = true, allowableValues = "debito, deposito") @Valid @RequestParam(value = "tipo", required = true) String tipo);


    @ApiOperation(value = "Exclui a Transação.", nickname = "excluiTransacao", notes = "Exclusão da Transação efetuada", authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Transacao", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Transação excluída com sucesso."),
        @ApiResponse(code = 400, message = "Requisição inválida."),
        @ApiResponse(code = 401, message = "Requisição não autorizada."),
        @ApiResponse(code = 500, message = "Erro no servidor.") })
    @RequestMapping(value = "/transacao/{codigo}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> excluiTransacao(@ApiParam(value = "",required=true) @PathVariable("codigo") Long codigo,@ApiParam(value = "" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization);

}