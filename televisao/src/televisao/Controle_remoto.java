package televisao;

import java.util.Scanner;




public class Controle_remoto implements Controlador{

private int volume;
private boolean ligado;
	private boolean tocando;


Scanner teclado = new Scanner(System.in);

public Controle_remoto() {
	super();

this.setVolume(50);
this.setLigado(false);
this.setTocando(false);
}


public int getVolume() {
	return volume;
}
public void setVolume(int volume) {
	this.volume = volume;
}

public boolean getLigado() {
	return ligado;
}

public void setLigado(boolean ligado) {
	this.ligado = ligado;
}

public boolean getTocando() {
	return tocando;
}

public void setTocando(boolean tocando) {
	this.tocando = tocando;
}

@Override
public void menu_principal() { 
String opcao;
boolean verifica;


System.out.println("Escolha uma das opções  do menu");
System.out.println("1. ligar televisão \n"
		+ "2. desligar televisão \n"
		+"3. almentar volume \n"
		+ "4. diminuir volume \n"
		+ "5. ativar mudo \n"
		+ "6. desativar mudo \n"
		+ "7. reproduzir mídia\n"
		+ "8. pausar mídia\n"
		+ "9. status da televisão ");

verifica = false;
do
{
opcao = teclado.nextLine();

if(opcao.matches("\\d{2}") || ! opcao.equals("10"))
{
verifica = true;
}
else {
System.out.println("Erro");
verifica = false;
}

switch (opcao) {
case "1": {
ligar();
break;
}
case "2":{
desligar();
break;
}
case "3":{
mais_volume();
break;
}
case "4":{
menos_volume();
break;
}
case "5":{
	ligar_mudo();
	break;
}
case "6":{
desligar_mudo();
break;
}
case "7":{
tocar();
break;
}
case "8": {
pausar();
break;
}
case "9": {
mostrar_status();
break;
}
default: {
System.out.println("Erro, uma opção que não existe foi selecionada \n digite novamente uma opção do menu");
}
}
}while(! opcao.equals("2") ||  verifica ==  false);

}
@Override
public void ligar() {
	// TODO Auto-generated method stub

if(this.getLigado() == false)
{
this.setLigado(true);
System.out.println("Televisão ligada");
}
else {
System.out.println("Erro, a televisão já está ligada");
}

menu_principal();
}

@Override
public void desligar() {
	// TODO Auto-generated method stub

if(this.getLigado() == true)
{
this.setLigado(false);
System.out.println("Televisão desligada");
}
else {
System.out.println("Erro, não é possível desligar a televisão pois ela já está desligada");
}
}

@Override
public void tocar() {

if(this.getLigado() == true)
{
if(this.getTocando() == false)
{
this.setTocando(true);
System.out.println("reproduzindo a mídia");
}
else {
System.out.println("Erro, a mídia já está tocando");
}
}
else {
System.out.println("Erro, não é possível reproduzir a mídia pois a televisão está desligada");
}

menu_principal();
}

@Override
public void pausar() {

if(this.getLigado() == true)
{
if(this.getTocando() == true)
{
this.setTocando(false);
System.out.println("A reprodução da mídia foi pausáda");
}
else {
System.out.println("Erro, a mídia já foi pausada ");
}
}
else {
System.out.println("Erro, a televisão está desligada , nenhuma mídia está tocando");
}

menu_principal();

}

@Override
public void mais_volume() {

	if(this.getLigado() == true)
	{
	if(this.getVolume() < 100)
	{
	this.setVolume(getVolume() + 5);
System.out.println("volume almentado  para " + this.getVolume());
	}
	else {
	System.out.println("Erro,  o volume já está no máximo ");
	}
	}
	else {
	System.out.println("Erro, a televisão está desligada, não é possível almentar o volume");
	}

menu_principal();


}

@Override
public void menos_volume() {

	if(this.getLigado() == true)
	{
	if(this.getVolume() >  0)
	{
	this.setVolume(getVolume() - 5);
System.out.println("O volume foi diminuido para " + this.getVolume());
	}
	else {
	System.out.println("Erro,  o volume já está no mínimo não é possível diminuir ");
	}
	}
	else {
	System.out.println("Erro, a televisão está desligada, não é possível diminuir o volume");
	}

menu_principal();
}

@Override
public void ligar_mudo() {

if(this.getLigado() == true)
{
if(this.getVolume() > 0)
{
this.setVolume(0);
System.out.println("O mudo está ativado ");
}
else {
System.out.println("Erro, o mudo já está ativado");
}
}
else {
System.out.println("Erro, a televisão está desligada, não é possível ativar o mudo");
}

menu_principal();
}

@Override
public void desligar_mudo() {
if(this.getLigado() == true)
{
if(this.getVolume() == 0)
{
this.setVolume(50);
System.out.println("Mudo desativado");
}
else {
System.out.println("Erro, o mudo já está desativado");
}
}
else {
System.out.println("Erro, a televisão está desligada");
}

menu_principal();
}


@Override
public void mostrar_status() {

System.out.println("Status da televisão");

System.out.println("Ela está ligada ? " + this.getLigado());
System.out.println("Está tocando alguma mídia ?" + this.getTocando());
System.out.printf("O volume da televisão está em %d %% \n",  this.getVolume());
System.out.println("");

menu_principal();
}


}
