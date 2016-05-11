// Optional values to override DB table names for this plugin:
//mailinglist.table.schedule='MyScheduler'
//mailinglist.table.attachments='something'
//mailinglist.table.categories='something'
//mailinglist.table.from='something'
//mailinglist.table.mailinglist='something'
//mailinglist.table.schedule='something'
//mailinglist.table.senders='something'
//mailinglist.table.templates='something'

// Your date format that matches input of jquery datepicker config
//mailinglist.dtFormat='dd/MM/yyyy HH.mm'


ckeditor {
	//config = "/js/myckconfig.js"
		skipAllowedItemsCheck = false
	defaultFileBrowser = "ofm"
	upload {
		//basedir = "/uploads/"
		baseurl="${grails.baseURL}"+'/uploads/'
		basedir = "${externalUploadPath}"
			overwrite = false
			link {
				browser = true
				upload = false
				allowed = []
				denied = ['html', 'htm', 'php', 'php2', 'php3', 'php4', 'php5',
							  'phtml', 'pwml', 'inc', 'asp', 'aspx', 'ascx', 'jsp',
						  'cfm', 'cfc', 'pl', 'bat', 'exe', 'com', 'dll', 'vbs', 'js', 'reg',
						  'cgi', 'htaccess', 'asis', 'sh', 'shtml', 'shtm', 'phtm']
			}
			image {
				browser = true
				upload = true
				allowed = ['jpg', 'gif', 'jpeg', 'png']
				denied = []
			}
			flash {
				browser = false
				upload = false
				allowed = ['swf']
				denied = []
			}
	}
}
jqueryDateTimePicker {
	format {
		java {
			datetime = "dd/MM/yyyy HH.mm"
			date = "dd/MM/yyyy"
		}
		picker {
			date = "'dd/mm/yy'"
			time = "'H.mm'"
		}
	}
}

grails.mime.types = [ html: ['text/html','application/xhtml+xml'],
	xml: ['text/xml', 'application/xml'],
	text: 'text-plain',
	js: 'text/javascript',
	rss: 'application/rss+xml',
	atom: 'application/atom+xml',
	css: 'text/css',
	csv: 'text/csv',
	pdf: 'application/pdf',
	rtf: 'application/rtf',
	excel: 'application/vnd.ms-excel',
	ods: 'application/vnd.oasis.opendocument.spreadsheet',
	all: '*/*',
	json: ['application/json','text/json'],
	form: 'application/x-www-form-urlencoded',
	multipartForm: 'multipart/form-data'
  ]
