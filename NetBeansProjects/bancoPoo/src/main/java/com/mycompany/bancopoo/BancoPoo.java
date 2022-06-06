
package com.mycompany.bancopoo;

public class BancoPoo {
//atributos
public numConta: int;
protected tipo: char;
private dono: char;
private saldo: float;
private status: boolean;  
 //metodos especiais
public Construtor(){
    saldo = 0;
    status = false;
}
public setNumConta(n:int){
numConta = 0
} 
public getNumConta(){
    return numConta;
}
public setTipo(t:char){
    tipo = t;
}
public getTipo(){
    return tipo;
}
public setDono(d:char){
dono = d;
}
public getdono(){
    return dono;
}
public setSaldo(s:float){
    saldo = s;
}
public getSaldo(){
    return saldo;
}
public setStatus(st:boolean){
    status = st;
}
public getStatus(){
    return status;
}
//metodos específicos
public abrirConta(t:char){
    setTipo(t);
    setStatus(true);
    if (t ="CC"){
        setSaldo = 50;
    }
    else if (t = "CP"){
        setSaldo = 150;
    }

}
public fecharConta(){
    if (saldo > 0){
        System.out.println("Conta possui dinheiro");
    }
    else if (saldo <= 0){
        System.out.println("Conta em débito");
    }
    else {setStatus(false);
    }
}
public depositar(v:float){
    if (status = true){
        setSaldo(getSaldo()+v);
    }
    else {
        System.out.println("Impossível depositar");
    }
}
public sacar(v:float){
    if (status = true){
        if (saldo > v){
            setSaldo(getSaldo()- v);
        }
    }
    else {
        System.out.println("Saldo insuficiente");
    }
    else {
            System.out.println("Impossível Sacar");
    }
}
public pagarMensal(){
    var v: float;
    if (tipo = "CC"){
        v = 12;
    }
    else if (tipo = "CP"){
        v = 20;
    }
}
    if (status = true){
        if (saldo > v){
            setSaldo(getSaldo()- v);
        }
        else {
            System.out.println("Saldo insuficiente");
        }
}
    else {
    System.out.println("Impossivel pagar");
}

}


