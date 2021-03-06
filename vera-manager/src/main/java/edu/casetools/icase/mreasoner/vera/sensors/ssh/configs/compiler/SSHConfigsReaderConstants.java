/* Generated By:JavaCC: Do not edit this line. SSHConfigsReaderConstants.java */
package edu.casetools.icase.mreasoner.vera.sensors.ssh.configs.compiler;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface SSHConfigsReaderConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int QUOTE = 9;
  /** RegularExpression Id. */
  int ENDQUOTE = 11;
  /** RegularExpression Id. */
  int CHAR = 12;
  /** RegularExpression Id. */
  int CNTRL_ESC = 13;
  /** RegularExpression Id. */
  int LEFT_BRACKET = 14;
  /** RegularExpression Id. */
  int RIGHT_BRACKET = 15;
  /** RegularExpression Id. */
  int POINT = 16;
  /** RegularExpression Id. */
  int COMMA = 17;
  /** RegularExpression Id. */
  int TWO_POINT = 18;
  /** RegularExpression Id. */
  int SLASH = 19;
  /** RegularExpression Id. */
  int COUNTER_SLASH = 20;
  /** RegularExpression Id. */
  int LOWER = 21;
  /** RegularExpression Id. */
  int HIGHER = 22;
  /** RegularExpression Id. */
  int HYPHEN = 23;
  /** RegularExpression Id. */
  int UNDERSCORE = 24;
  /** RegularExpression Id. */
  int DIGIT = 25;
  /** RegularExpression Id. */
  int ALPHABET = 26;
  /** RegularExpression Id. */
  int CAPSALPHABET = 27;
  /** RegularExpression Id. */
  int STRING = 28;
  /** RegularExpression Id. */
  int HOSTNAME = 29;
  /** RegularExpression Id. */
  int HOSTNAME_END = 30;
  /** RegularExpression Id. */
  int PORT = 31;
  /** RegularExpression Id. */
  int PORT_END = 32;
  /** RegularExpression Id. */
  int USERNAME = 33;
  /** RegularExpression Id. */
  int USERNAME_END = 34;
  /** RegularExpression Id. */
  int PASSWORD = 35;
  /** RegularExpression Id. */
  int PASSWORD_END = 36;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int INSIDE_COMMENT = 1;
  /** Lexical state. */
  int STRING_STATE = 2;
  /** Lexical state. */
  int ESC_STATE = 3;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<token of kind 5>",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 8>",
    "\"\\\"\"",
    "\"\\\\\"",
    "<ENDQUOTE>",
    "<CHAR>",
    "<CNTRL_ESC>",
    "\"(\"",
    "\")\"",
    "\".\"",
    "\",\"",
    "\":\"",
    "\"/\"",
    "\"\\\\\"",
    "\"<\"",
    "\">\"",
    "\"-\"",
    "<UNDERSCORE>",
    "<DIGIT>",
    "<ALPHABET>",
    "<CAPSALPHABET>",
    "<STRING>",
    "\"<HOSTNAME>\"",
    "\"</HOSTNAME>\"",
    "\"<PORT>\"",
    "\"</PORT>\"",
    "\"<USERNAME>\"",
    "\"</USERNAME>\"",
    "\"<PASSWORD>\"",
    "\"</PASSWORD>\"",
  };

}
