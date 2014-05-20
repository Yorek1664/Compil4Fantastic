grammar testOpe;

options
{
    language=Java;
}


progr   : expr;

expr : var (operator expr)?;

var : neg
	| INT
	;
	
neg : '-' var;

operator : addSubtractOp
	|	multiplyDivideOp
	;
	
addSubtractOp 
	:	'+'
	|   '-'
	;    
 
multiplyDivideOp 
	:	'*' 
	|   '/'
	;    
 
comparatorOp 
	:	'>'
	|   '<'
	| 	'>='
	|	'<='
	|	'!='
	;


INT :	'0'..'9'+
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

