const path = require('path');
const MiniCssExtractPlugin = require('mini-css-extract-plugin');
const sveltePreprocess = require('svelte-preprocess');

module.exports = {
    mode: "development",
    entry: {
        'v1mix2.header': './app/templateengine/v1mix2/typescript/HeaderLoader.ts',
        'v2.index': './app/templateengine/v2/typescript/IndexLoader.ts',
        'v2.articleList': './app/templateengine/v2/typescript/ArticleListLoader.ts',
        'v2.form': './app/templateengine/v2/typescript/FormLoader.ts'
    },
    output: {
        path: path.resolve('./public/bundles'),
        publicPath: '/assets/bundles',
        filename: '[name].js'
    },
    resolve: {
        extensions: ['.ts', '.js', '.scss', '.svelte']
    },
    module: {
        rules: [
            {
                test: /\.(svelte)$/,
                exclude: /node_modules/,
                use: {
                    loader: 'svelte-loader',
                    options: {
                        onwarn: (warning, handler) => { //blocks warnings for unused css classes in svelte
                            const { code, frame } = warning;
                            if (code === "css-unused-selector")
                                return;
                            handler(warning);
                        },
                        preprocess: sveltePreprocess({
                            typescript: {
                                compilerOptions: {
                                    "module": "ES6",
                                    "moduleResolution": "classic"
                                }
                            }
                        }),
                    },
                },
            },

            {
                test: /\.(sa|sc|c)ss$/,
                exclude: /node_modules/,
                use: [
                    MiniCssExtractPlugin.loader,
                    'css-loader',
                    'sass-loader'
                ]
            },

            {
                test: /\.ts$/,
                use: 'ts-loader'
            }
        ]
    },
    plugins: [
        new MiniCssExtractPlugin({
            filename: "[name].css"
            // filename: isDevelopment ? '[name].css' : '[name].[hash].css',
            // chunkFilename: isDevelopment ? '[id].css' : '[id].[hash].css'
        })
    ],
};