grammar fantastic4;

options
{
    language=Java;
}


prog        : 'program' IDF vardeclist? funcdeclist? instr
            ;

vardeclist  : varsuitdecl vardeclist?
            ;
            
varsuitdecl : 'var' idenlist ':' typename ';'
            ;
            
idenlist    : IDF
            | IDF ',' idenlist
            ;
            
typename    : 'void'
            | 'bool'
            | 'int'
            | 'char'
            ;
            
funcdeclist : funcdecl funcdeclist?
            ;
            
funcdecl    : 'function' IDF '(' arglist ')' ':' typename vardeclist? instr
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
            | IDF '=' expr ';'
            | 'return' returnable
            | IDF '(' exprlist ')'
            | '{' sequence '}'
            | 'read' IDF ';'
            | 'write' writable ';'
            ;

returnable	: ';'
			| expr ';'
			;

writable    : IDF
            | cste
            ;

sequence    : 
            | instr  sequence
            ;
            
exprlist    : expr nextexpr
            ;

nextexpr    :
            | ',' expr
            ;

expr        : cste expr2
            | '(' expr ')' expr2
            | opun expr
            | IDF '(' exprlist ')' expr2
            | IDF '(' ')' expr2
            | IDF expr2
            ;
            
expr2		: opb expr
			| 
			;

cste		: CSTEINT
			| CSTEBOOL
			| CSTESTRING
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


CSTEBOOL    :('true'|'false')								;
CSTEINT		:('0'..'9')+            						;
CSTESTRING	:('"'*'"')										;
IDF     : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*  ;
COMM    : ('/*'*'*/')|('//'*'\n') {$channel=HIDDEN;}        ;
WS      : (' '|'\t'|'\n')+ {$channel=HIDDEN;}               ;