grammar fantastic4;

options
{
    output=AST;
    language=Java;
}
tokens{ 
ARGUMENTS;ARGU;BLOCK;CALLFUNCTION;EPSILON;
}

prog        : 'program' IDF vardeclist? funcdeclist? instr? -> ^(IDF vardeclist? funcdeclist? instr?)
            ;

vardeclist  : varsuitdecl vardeclist? ->  varsuitdecl vardeclist?
            ;
            
varsuitdecl : 'var' idenlist ':' typename ';' -> ^('var' typename idenlist)
            ;
            
idenlist    : IDF		-> ^(IDF)
            | IDF ',' idenlist	-> IDF idenlist
            ;
            
typename    : 'void' -> 'void'
            | 'bool' -> 'bool'
            | 'int'  -> 'int'
            | 'char' -> 'char'
            ;
            
funcdeclist : funcdecl funcdeclist?
            ;
            
funcdecl    : 'function' IDF '(' arglist? ')' ':' typename vardeclist? instr -> ^('function' typename ^(IDF vardeclist? instr ) arglist? )
            ;

arglist     : arg^
            | arg ',' arglist -> ^(ARGUMENTS arg arglist)
            ;

arg         : IDF ':' typename -> ^(ARGU IDF typename)
            | 'ref' IDF ':' typename -> ^('ref' IDF typename)
                        ;

instr       : 'if' expr 'then' instr ('else'  instr)? 'fi' ->  ^('if' expr ^('then' instr) ^('else' instr)?)
            | 'while' expr 'do' instr -> ^('while' expr ^(BLOCK instr))
            | IDF '=' expr ';'  -> ^('=' IDF expr)
            | 'return' returnable -> ^('return' returnable)
            | IDF '(' exprlist ')' ';' ->  ^(CALLFUNCTION IDF exprlist) 
            | '{' sequence? '}' ->  sequence?
            | 'read' IDF ';' -> ^('read' IDF)
            | 'write' writable ';' -> ^('write' writable)
            ;

returnable	: expr ';' -> expr
			;


writable    : IDF -> IDF
            | cste -> cste
            ;

sequence    :  instr  sequence? -> instr sequence?
            ;
            
exprlist    : expr nextexpr? -> expr nextexpr?
            ;

nextexpr    :',' exprlist -> exprlist
            ;

expr	:  add -> add
	    ;
	
add : mult (addSubtractOp^ add)? 
	;	
 

mult 
	: and (multiplyDivideOp^  mult)? 
	;
     
and 
	: comp ('&&'^  and)? 
	;
 
comp
	: or (comparatorOp^  comp)? 	  
	;
 
or 	: puis ('||'^  or)? 
	;
 
puis	
	:  negExpression ('^'^ puis)?
	;
 
negExpression: neg? expressionAtom
	;
	
 expressionAtom :	-> EPSILON
				|   cste -> cste
				|   IDF -> IDF
				|  ( '(' add ')' ) -> add
				|	IDF '(' exprlist ')' -> ^(IDF exprlist)
				;
addSubtractOp 
	: '+' -> '+'
	|   '-' -> '-'
	;    
 
multiplyDivideOp 
	: '*' -> '*'
	|   '/' -> '/'
	;    

 
comparatorOp 
	: '>' -> '>'
	|  '<' -> '<'
	|  '>=' -> '>='
	| '<=' -> '<='
	| '!=' -> '!='
	;

cste		: CSTEINT -> CSTEINT
			| CSTEBOOL -> CSTEBOOL
			| CSTESTRING -> CSTESTRING
			;
            
neg        	: 'not' -> 'not'
	|'!' -> '!'
            	;

CSTEBOOL    :('true'|'false')								;
CSTEINT		:('0'..'9')+            						;
CSTESTRING	:('"') (~('"')*) ('"')								;
IDF     : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*  ;
COMM    : ('/*'*'*/')|('//'*'\n') {$channel=HIDDEN;}        ;
WS      : (' '|'\t'|'\n'|'\r')+ {$channel=HIDDEN;}               ;