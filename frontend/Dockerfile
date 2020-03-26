# Stage 1
FROM node:13.10.1-alpine as react-build
WORKDIR /app
ENV PATH /app/node_modules/.bin:$PATH
COPY time-tracker/ ./
#TODO: Remove that ls
RUN ls
RUN yarn
RUN yarn build

# Stage 2 - the production environment
FROM nginx:alpine
#COPY nginx.conf /etc/nginx/conf.d/default.conf
COPY --from=react-build /app/build /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]