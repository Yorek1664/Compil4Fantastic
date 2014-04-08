grammar fantastic4;

options
{
   backtrack=true;
   language=Java;
}


prog        : 'program' IDF vardeclist funcdeclist instr 
            ;

vardeclist  :
            | varsuitdecl vardeclist
            ;
            
varsuitdecl : 'var' idenlist ':' typename
            ;
            
idenlist    : IDF
            | IDF ',' idenlist
            ;
            
typename    : 'void'
            | 'bool'
            | 'int'
            | 'char'
            ;
            
funcdeclist :
            | funcdecl funcdeclist
            ;
            
funcdecl    : 'function' IDF '(' arglist ')' ':' typename vardeclist instr
            ;

arglist     :
            | arg
            | arg ',' arglist
            ;

arg         : IDF ':' typename
            | 'ref' IDF ':' typename
            ;

instr       : 'if' expr 'then' instr 'else' instr
            | 'while' expr 'do' instr
            | IDF '=' expr
            | 'return' returnable
            | IDF '(' exprlist ')'
            | '{' sequence '}'
            | 'read' IDF
            | 'write' writable
            ;

writable    : IDF
            | CSTE
            ;
            
returnable  :
            | expr
            ;

sequence    : 
            | instr ';' sequence
            ;
            
exprlist    : expr
            | expr ',' exprlist
            ;

expr        : CSTE
            | '(' expr ')'
            | expr2 opb expr
            | opun expr
            | IDF '(' exprlist ')'
            | IDF '(' ')'
            | IDF
            ;

expr2       : CSTE
            | '(' expr ')'
            | opun expr
            | IDF '(' exprlist ')'
            | IDF '(' ')'
            | IDF
            ;

opb         : '+'
            | '-'
            | '*'
            | '/'
            | '<'
            | '<='
            | '>'
            | '>='
            | '=='
            | '!='
            | 'and'
            | 'or'
            ;
            
opun        : '-'
            | 'not'
            ;


IDF     : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*  ;
CSTE    : ('true'|'false')|('"'*'"')|('0'..'9')+                ;
COMM    : ('/*'*'*/')|('//'*'\n') {$channel=HIDDEN;}        ;
WS      : (' '|'\t'|'\n')+ {$channel=HIDDEN;}               ;
