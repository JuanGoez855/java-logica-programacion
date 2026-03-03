package com.example;

public class Main {
    public static void main(String[] args) {
        //VariablesYContantes

        VariablesYConstantes.demostrarDeclaracionAsignacion();
        VariablesYConstantes.demostrarConvencionesNombres();
        VariablesYConstantes.demostrarConstantes();

        //TiposDeDatosPrimitivos

        TiposDeDatosPrimitivos.demostrarEnteros();
        TiposDeDatosPrimitivos.demostrarFlotantes();
        TiposDeDatosPrimitivos.demostrarCaracteres();
        TiposDeDatosPrimitivos.demostrarBooleanos();

        //ConversionDeTipos

        ConversionDeTipos.demostrarCastingImplicito();
        ConversionDeTipos.demostrarCastingExplicito();
        ConversionDeTipos.demostrarProblemasDePrecision();

        //Operadores
        Operadores.demostrarAritmeticos();
        Operadores.demostrarIncrementoDecremento();
        Operadores.demostrarRelacionales();
        Operadores.demostrarLogicos();
        Operadores.demostrarAsignacionCompuesta();
        Operadores.demostrarOperadoresTernarios();

        //EntradaDeDatos
        EntradaDeDatos.leerVariosTipos();
        EntradaDeDatos.leerCadenaCompleta();
        EntradaDeDatos.manejarSaltoDeLineaPendiente();

        //EstructurasCondicionales
        EstructurasCondicionales.ejemploIf();
        EstructurasCondicionales.ejemploIfElse();
        EstructurasCondicionales.ejemploIfElseIfElse();
        EstructurasCondicionales.ejemploSwitch();
        EstructurasCondicionales.ejemploSwitchExpresion();

        //EstructurasDeRepeticion
        EstructurasDeRepeticion.ejemploWhile();
        EstructurasDeRepeticion.ejemploDoWhile();
        EstructurasDeRepeticion.ejemploForClasico();
        EstructurasDeRepeticion.ejemploForAnidado();
        EstructurasDeRepeticion.ejemploBreakContinue();
        EstructurasDeRepeticion.ejemploEtiquetas();

        //MetodosEstaticosSimples
        MetodosEstaticosSimples.ejemploDeclaracionLlamada();
        MetodosEstaticosSimples.ejemploPasoParametros(10);
        MetodosEstaticosSimples.ejemploRetornoValores();
        MetodosEstaticosSimples.ejemploSobrecarga(10);
        MetodosEstaticosSimples.ejemploSobrecarga("Hola java");
        MetodosEstaticosSimples.ejemploSobrecarga(5, 15);

        //ArreglosUnidimensionales
        ArreglosUnidimensionales.declararCrearInicializar();
        ArreglosUnidimensionales.mostrarLongitud();
        ArreglosUnidimensionales.recorrerConForClasico();
        ArreglosUnidimensionales.recorrerConForEach();
        ArreglosUnidimensionales.arrayComoParametroYRetorno();
        ArreglosUnidimensionales.procesarYRetornarPares(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        //ArreglosBidimensionales
        ArreglosBidimensionales.declararCrearMatrices();
        ArreglosBidimensionales.recorrerMatriz();

        //ManipulacionCadenas
        ManipulacionCadenas.demostrarConcatenacion();
        ManipulacionCadenas.demostrarMetodosUtiles();
        ManipulacionCadenas.demostrarInmutabilidad();
        ManipulacionCadenas.usarStringBuilder();

        //ManejoBasicoExcepciones
        ManejoBasicoExcepciones.ejemploTryCatchDivision();
        ManejoBasicoExcepciones.ejemploTryCatchInput();
        ManejoBasicoExcepciones.ejemploBloqueFinally();
        ManejoBasicoExcepciones.evitarCierrePrograma();
    }
}