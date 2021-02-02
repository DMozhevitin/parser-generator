grammar MetaGrammar;

metaGrammar: grammarName header? attrs? rules ;
grammarName: GRAMMAR IDENTIFIER ;
header: HEADER code ;
attrs: ATTRIBUTES attr+;
attr: ANGLE_OPEN IDENTIFIER COLON IDENTIFIER ANGLE_CLOSE ;
rules: grammarRule+ ;
grammarRule: terminalRule | nonTerminalRule ;
terminalRule: TOKEN_NAME COLON REGEX code? SKIP_RULE? SEMICOLON ;
nonTerminalRule: IDENTIFIER attr? COLON alternative (OR alternative)* SEMICOLON ;
alternative: production+ code? ;
production: TOKEN_NAME | IDENTIFIER inheritedAttr? ;
code: CODE ;
inheritedAttr: EXPR_IN_PARENTHESIS ;

GRAMMAR: 'grammar' ;
IMPORT: 'import' ;
HEADER: 'header' ;
ATTRIBUTES: 'attributes' ;
RETURNS: 'returns' ;
PACKAGE: 'package' ;
SKIP_RULE: '-> skip' ;

OR: '|' ;
COLON: ':' ;
SEMICOLON: ';' ;
BRACKET_OPEN: '{' ;
BRACKET_CLOSE: '}' ;
OPEN: '(' ;
CLOSE: ')' ;
DOT: '.' ;
ANGLE_OPEN: '<' ;
ANGLE_CLOSE: '>' ;
EQ: '=' ;

TOKEN_NAME: [A-Z_]+ ;
IDENTIFIER: [a-zA-Z]+ ;
CODE: BRACKET_OPEN .+? BRACKET_CLOSE ;
EXPR_IN_PARENTHESIS: OPEN .+? CLOSE ;
REGEX: '"'.*?'"' ;
WHITESPACE: [ \t\r\n] -> skip ;