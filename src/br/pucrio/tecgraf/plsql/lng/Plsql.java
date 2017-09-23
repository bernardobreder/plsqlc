package br.pucrio.tecgraf.plsql.lng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import br.pucrio.tecgraf.plsql.lng.grammer.FormsPlSql;
import br.pucrio.tecgraf.plsql.lng.grammer.ParseException;

/**
 * Classe Plsql que realiza o parser de um arquivo
 * 
 * @author Tecgraf
 */
public class Plsql {

  /**
   * @param input
   * @throws ParseException
   */
  public static void compile(InputStream input) throws ParseException {
    FormsPlSql plSql = new FormsPlSql(input, "utf-8");
    plSql.SqlFile();
  }

  /**
   * @param args
   * @throws UnsupportedEncodingException
   * @throws ParseException
   * @throws FileNotFoundException
   */
  public static void main(String[] args) throws UnsupportedEncodingException,
    ParseException, FileNotFoundException {
    compile(new FileInputStream(new File(
      "D:/eclipsew/project/9_0_bandeirabr/db/scenarium_pkg.sql")));
  }
}
