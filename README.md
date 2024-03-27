# GUI Calculator in JavaFX with Gradle

---
[![Build Status](https://app.travis-ci.com/Maksikos-ctrl/CalculatorMavenUniza.svg?token=UYGmcsn4XrNNXnFFyfvP&branch=master)](https://app.travis-ci.com/Maksikos-ctrl/CalculatorMavenUniza)


## Overview

This project implements a Graphical User Interface (GUI) Calculator using JavaFX and Maven. The calculator provides a user-friendly interface for basic arithmetic operations such as addition, subtraction, multiplication, and division.

## Features

- User-friendly GUI interface.
- Supports addition, subtraction, multiplication, and division operations.
- Responsive design for seamless user experience.
- Implemented using JavaFX for GUI and Maven for build automation.

## Requirements

- Java Development Kit (JDK) 8 or higher.
- Maven build tool.
- JavaFX SDK (included in JDK 8, separate download for JDK 11 and later).

## Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/Maksikos-ctrl/CalculatorMavenUniza.git
    ```

2. Navigate to the project directory:

    ```bash
    cd CalculatorMavenUniza
    ```

3. Build the project using Maven:

    ```bash
    mvn clean package
    ```

4. Run the application:

    ```bash
    java -jar target/CalculatorMavenUniza-1.0-SNAPSHOT.jar
    ```

## Usage

1. Upon launching the application, the calculator GUI will appear.
2. Use the mouse or keyboard to input numbers and perform operations.
3. Click on the respective buttons for addition (+), subtraction (-), multiplication (*), and division (/).
4. Press the "=" button to display the result of the operation.

## Project Structure

CalculatorMavenUniza/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── (source files)
│ │ │
│ │ └── resources/
│ │ └── (resource files)
│ │
│ └── test/
│ └── java/
│ └── (test files)
│
├── pom.xml
└── README.md

css


- **src/main/java/**: Contains Java source files for the calculator application.
- **src/main/resources/**: Contains resource files such as FXML files for the JavaFX UI.
- **src/test/java/**: Contains test files for unit testing (if applicable).
- **pom.xml**: Configuration file for Maven build automation.
- **README.md**: Documentation file (this file) providing information about the project.

## Contributing

Contributions are welcome! If you would like to contribute to this project, feel free to fork the repository and submit a pull request with your changes.

## License

This project is licensed under the [MIT License](LICENSE).

## Authors

- [Maksikos-ctrl](https://github.com/Maksikos-ctrl)

## Acknowledgments

- Thanks to the JavaFX and Maven communities for their valuable resources and documentation.

---

Feel free to customize this README to fit your specific project details and preferences.

Dillinger is a cloud-enabled, mobile-ready, offline-storage compatible,
AngularJS-powered HTML5 Markdown editor.

- Type some Markdown on the left
- See HTML in the right
- ✨Magic ✨

## Features

- Import a HTML file and watch it magically convert to Markdown
- Drag and drop images (requires your Dropbox account be linked)
- Import and save files from GitHub, Dropbox, Google Drive and One Drive
- Drag and drop markdown and HTML files into Dillinger
- Export documents as Markdown, HTML and PDF

Markdown is a lightweight markup language based on the formatting conventions
that people naturally use in email.
As [John Gruber] writes on the [Markdown site][df1]

> The overriding design goal for Markdown's
> formatting syntax is to make it as readable
> as possible. The idea is that a
> Markdown-formatted document should be
> publishable as-is, as plain text, without
> looking like it's been marked up with tags
> or formatting instructions.

This text you see here is *actually- written in Markdown! To get a feel
for Markdown's syntax, type some text into the left window and
watch the results in the right.

## Tech

Dillinger uses a number of open source projects to work properly:

- [AngularJS] - HTML enhanced for web apps!
- [Ace Editor] - awesome web-based text editor
- [markdown-it] - Markdown parser done right. Fast and easy to extend.
- [Twitter Bootstrap] - great UI boilerplate for modern web apps
- [node.js] - evented I/O for the backend
- [Express] - fast node.js network app framework [@tjholowaychuk]
- [Gulp] - the streaming build system
- [Breakdance](https://breakdance.github.io/breakdance/) - HTML
to Markdown converter
- [jQuery] - duh

And of course Dillinger itself is open source with a [public repository][dill]
 on GitHub.

## Installation

Dillinger requires [Node.js](https://nodejs.org/) v10+ to run.

Install the dependencies and devDependencies and start the server.

```sh
cd dillinger
npm i
node app
```

For production environments...

```sh
npm install --production
NODE_ENV=production node app
```

## Plugins

Dillinger is currently extended with the following plugins.
Instructions on how to use them in your own application are linked below.

| Plugin | README |
| ------ | ------ |
| Dropbox | [plugins/dropbox/README.md][PlDb] |
| GitHub | [plugins/github/README.md][PlGh] |
| Google Drive | [plugins/googledrive/README.md][PlGd] |
| OneDrive | [plugins/onedrive/README.md][PlOd] |
| Medium | [plugins/medium/README.md][PlMe] |
| Google Analytics | [plugins/googleanalytics/README.md][PlGa] |

## Development

Want to contribute? Great!

Dillinger uses Gulp + Webpack for fast developing.
Make a change in your file and instantaneously see your updates!

Open your favorite Terminal and run these commands.

First Tab:

```sh
node app
```

Second Tab:

```sh
gulp watch
```

(optional) Third:

```sh
karma test
```

#### Building for source

For production release:

```sh
gulp build --prod
```

Generating pre-built zip archives for distribution:

```sh
gulp build dist --prod
```

## Docker

Dillinger is very easy to install and deploy in a Docker container.

By default, the Docker will expose port 8080, so change this within the
Dockerfile if necessary. When ready, simply use the Dockerfile to
build the image.

```sh
cd dillinger
docker build -t <youruser>/dillinger:${package.json.version} .
```

This will create the dillinger image and pull in the necessary dependencies.
Be sure to swap out `${package.json.version}` with the actual
version of Dillinger.

Once done, run the Docker image and map the port to whatever you wish on
your host. In this example, we simply map port 8000 of the host to
port 8080 of the Docker (or whatever port was exposed in the Dockerfile):

```sh
docker run -d -p 8000:8080 --restart=always --cap-add=SYS_ADMIN --name=dillinger <youruser>/dillinger:${package.json.version}
```

> Note: `--capt-add=SYS-ADMIN` is required for PDF rendering.

Verify the deployment by navigating to your server address in
your preferred browser.

```sh
127.0.0.1:8000
```

## License

MIT

**Free Software, Hell Yeah!**

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

   [dill]: <https://github.com/joemccann/dillinger>
   [git-repo-url]: <https://github.com/joemccann/dillinger.git>
   [john gruber]: <http://daringfireball.net>
   [df1]: <http://daringfireball.net/projects/markdown/>
   [markdown-it]: <https://github.com/markdown-it/markdown-it>
   [Ace Editor]: <http://ace.ajax.org>
   [node.js]: <http://nodejs.org>
   [Twitter Bootstrap]: <http://twitter.github.com/bootstrap/>
   [jQuery]: <http://jquery.com>
   [@tjholowaychuk]: <http://twitter.com/tjholowaychuk>
   [express]: <http://expressjs.com>
   [AngularJS]: <http://angularjs.org>
   [Gulp]: <http://gulpjs.com>

   [PlDb]: <https://github.com/joemccann/dillinger/tree/master/plugins/dropbox/README.md>
   [PlGh]: <https://github.com/joemccann/dillinger/tree/master/plugins/github/README.md>
   [PlGd]: <https://github.com/joemccann/dillinger/tree/master/plugins/googledrive/README.md>
   [PlOd]: <https://github.com/joemccann/dillinger/tree/master/plugins/onedrive/README.md>
   [PlMe]: <https://github.com/joemccann/dillinger/tree/master/plugins/medium/README.md>
   [PlGa]: <https://github.com/RahulHP/dillinger/blob/master/plugins/googleanalytics/README.md>
