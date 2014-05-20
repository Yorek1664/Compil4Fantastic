grammar fantastic4;

options
{
    output=AST;
    ASTLabelType=CommonTree;
    language=Java;
}


prog        : 'program' IDF vardeclist? funcdeclist? instr -> ^('program' IDF)
            ;

vardeclist  : varsuitdecl vardeclist? 
            ;
            
varsuitdecl : 'var' idenlist ':' typename ';' -> 'var'
            ;
            
idenlist    : IDF		-> ^(IDF ':')
            | IDF ',' idenlist	-> ^(IDF ',')
            ;
            
typename    : 'void' -> 'void'
            | 'bool' -> 'bool'
            | 'int'  -> 'int'
            | 'char' -> 'char'
            ;
            
funcdeclist : funcdecl funcdeclist?
            ;
            
funcdecl    : 'function' IDF '(' arglist ')' ':' typename vardeclist? instr -> ^('function' IDF '(' ')' ':')
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

returnable	: expr ';'
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

expr	: add
	    ;
	
add : mult (addSubtractOp add)?
	;	
 
mult
	: and (multiplyDivideOp  mult)? 
	;

and
	: comp ('&&'  and)?
	;
 
comp
	: or (comparatorOp  comp)? 	
	;
 
or 	: puis ('||'  or)? 
	;
 
puis	
	:  negExpression ('^' puis)?
	;
 
negExpression: neg? expressionAtom
	;
	
 expressionAtom : 
				|   cste
				|   IDF
				|  ( '(' add ')' )
				|	IDF '(' exprlist ')'
				;
 
 
addSubtractOp 
	: '+'
	|   '-'
	;    
 
multiplyDivideOp 
	: '*' 
	|   '/'
	;    
 
comparatorOp 
	: '>'
	|  '<'
	|  '>='
	| '<='
	| '!='
	;

cste		: CSTEINT
			| CSTEBOOL
			| CSTESTRING
			;
            
neg        	: 'not'
	|'!'
            	;


CSTEBOOL    :('true'|'false')								;
CSTEINT		:('0'..'9')+            						;
CSTESTRING	:('"'*'"')										;
IDF     : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*  ;
COMM    : ('/*'*'*/')|('//'*'\n') {$channel=HIDDEN;}        ;
WS      : (' '|'\t'|'\n')+ {$channel=HIDDEN;}               ;